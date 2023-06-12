SUMMARY = "YaST2 - British English Translations"
DESCRIPTION = "YaST2 - Translations for British English."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-en_GB-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "eb542a490c5350d026d99d2429f67949d876d23c72e8352ff24248f9739c80e5c9aaa2c77e72d0875c52e2068c6e377b134d546a2833da13aaf6c09a47e4755a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:en_GB) yast2-trans-en_GB"
RDEPENDS:${PN} += ""

inherit rpm
