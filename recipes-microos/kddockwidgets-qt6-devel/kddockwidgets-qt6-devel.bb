SUMMARY = "Development files for libkddockwidgets"
DESCRIPTION = "Development files for libkddockwidgets"
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "1.7.0"

RPM_NAME = "kddockwidgets-qt6-devel-1.7.0-1.1.aarch64.rpm"
RPM_HASH = "ba4e95664c24fcada98745e901226063cda4149b88f43095a62bc20d0794f9bf3c56f0fab513d997c8ad8e3121156b841b5040910199ed9d61d1098d1cec4c55"

RPROVIDES:${PN} += "cmake(KDDockWidgets-qt6) kddockwidgets-qt6-devel kddockwidgets-qt6-devel(aarch-64)"
RDEPENDS:${PN} += "libkddockwidgets-qt6-1_7"

inherit rpm
