package org.example

import com.android.tools.apk.analyzer.ApkAnalyzerCli
import com.android.tools.apk.analyzer.ApkAnalyzerImpl
import java.io.File

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val androidSdkPath = "<android sdk path>"
        val apkPath = "<apk path>"

        if (!File(apkPath).exists()) {
            println("APK not found: $apkPath")
            return
        }

        dexPackages(androidSdkPath, apkPath)
    }

    private fun dexPackages(androidSdkPath: String, apkPath: String) {
        val aaptInvoker = ApkAnalyzerCli.getAaptInvokerFromSdk(androidSdkPath)
        val impl = ApkAnalyzerImpl(System.out, aaptInvoker)
        impl.dexPackages(
            File(apkPath).toPath(),
            null, null, null, null,
            false, false,
            null
        )
    }
}