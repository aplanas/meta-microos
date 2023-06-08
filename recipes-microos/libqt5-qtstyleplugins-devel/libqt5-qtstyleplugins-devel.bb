SUMMARY = "Qt 5 Style Plugins Development Files"
DESCRIPTION = "You need this package, if you want to compile programs with qtstyleplugins."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "5.0.0+git20170311"

RPM_NAME = "libqt5-qtstyleplugins-devel-5.0.0+git20170311-10.10.aarch64.rpm"
RPM_HASH = "185c0b20210ac89d6a1f6bc65f398a2f08945decbf1bfa6d7075bf0e18d6e41e8de11f1a0e4f23639c83cba3ae2065445c75f78b0536ef626ef405e78314de4d"

RPROVIDES:${PN} += "libqt5-qtstyleplugins-devel libqt5-qtstyleplugins-devel(aarch-64)"
RDEPENDS:${PN} += "libqt5-qtstyleplugins libqt5-qtstyleplugins-platformtheme-gtk2"

inherit rpm
