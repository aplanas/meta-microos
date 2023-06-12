SUMMARY = "Software Management"
DESCRIPTION = "This pattern provides a graphical application and a command line tool for keeping your system up to date."
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-sw_management-20200505-41.1.aarch64.rpm"
RPM_HASH = "fcb8125a7f79f0a629bd6ceae0dd473ee2e391f60d38f2d07a20663cd6d2b5f1877ae85188d4e339b3ceff3cb7196a3389adc490fe99d6d8acb5a68ff42c721c"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-order() pattern-visible() patterns-base-sw_management patterns-base-sw_management(aarch-64) patterns-openSUSE-sw_management"
RDEPENDS:${PN} += "zypper"

inherit rpm
