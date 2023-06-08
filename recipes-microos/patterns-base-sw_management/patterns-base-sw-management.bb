SUMMARY = "Software Management"
DESCRIPTION = "This pattern provides a graphical application and a command line tool for keeping your system up to date."
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-sw_management-20200505-40.1.aarch64.rpm"
RPM_HASH = "bad3ac7ad9278850cd945f00be8e884098320e9dae7e224ee4a62a5993d55ee7eb747f04b7134e6015b0f7f4698e9c224e1b1736431d0ad76b915e98d76644ef"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-order() pattern-visible() patterns-base-sw_management patterns-base-sw_management(aarch-64) patterns-openSUSE-sw_management"
RDEPENDS:${PN} += "zypper"

inherit rpm
