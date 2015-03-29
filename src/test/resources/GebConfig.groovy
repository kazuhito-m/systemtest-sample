//import geb.report.ScreenshotAndPageSourceReporter

reportsDir = "build/reports/geb"

// 日本語エスケープ対策
//reporter = new ScreenshotAndPageSourceReporter() {
//    @Override
//    protected escapeFileName(String name) {
//        name.replaceAll('[\\\\/:\\*?\\"&lt;>\\|]', '_')
//    }
//}

baseUrl = "http://my-grabbit2.herokuapp.com/"
