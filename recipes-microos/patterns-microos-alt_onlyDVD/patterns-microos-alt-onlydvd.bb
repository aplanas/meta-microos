SUMMARY = "Alternative Packages only for the DVD of openSUSE MicroOS"
DESCRIPTION = "Alternative additional packages on a openSUSE MicroOS DVD."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-alt_onlyDVD-5.0-69.1.aarch64.rpm"
RPM_HASH = "3bcc681ec8274f9ae6f00df357b9a186166f10eb6764e26073e33e27aa8e948c478ed6db2dc792d4751f7723be62d0d0133136e8f4fcfbf39acb685051560562"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-order() patterns-microos-alt_onlyDVD patterns-microos-alt_onlyDVD(aarch-64)"
RDEPENDS:${PN} += "kernel-default-base pattern()"

inherit rpm
