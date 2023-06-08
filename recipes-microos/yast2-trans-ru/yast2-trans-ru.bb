SUMMARY = "YaST2 - Russian Translations"
DESCRIPTION = "YaST2 - Translations for Russian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-ru-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "fc92afe9c6c0e4b34c06863937815c1043e91da87ce8fe14faca6c05ef091f52bb5cb1322e45b56dd1b591e71ef30be8536aac7410328c8e41cacfb9c11a2109"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:ru) yast2-trans-ru"
RDEPENDS:${PN} += ""

inherit rpm
