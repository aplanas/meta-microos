SUMMARY = "openSUSE theme for Terminology"
DESCRIPTION = "openSUSE theme for Terminology"
LICENSE = "BSD-2-Clause & LGPL-2.1-only & CC-BY-SA-3.0"

PV = "20220430.1.26"

RPM_NAME = "terminology-theme-openSUSE-20220430.1.26-1.4.noarch.rpm"
RPM_HASH = "d419f7d81fdef3ceb32331eb704473d5fc43789756ae2714ddf6f39d256a51b9a7b941281473a202326582d54abffaa7a724f49fd13503a9aa9983db6e98d098"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "terminology-theme-dft terminology-theme-openSUSE"
RDEPENDS:${PN} += "terminology"

inherit rpm
