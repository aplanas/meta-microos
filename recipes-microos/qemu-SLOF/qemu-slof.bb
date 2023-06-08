SUMMARY = "Slimline Open Firmware - SLOF"
DESCRIPTION = "Slimline Open Firmware (SLOF) is an implementation of the IEEE 1275 standard. \
It can be used as partition firmware for pSeries machines running on QEMU or KVM."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "7.1.0"

RPM_NAME = "qemu-SLOF-7.1.0-16.1.noarch.rpm"
RPM_HASH = "b10ac8e925be134b2e4e15097e8800db617ca784b8c7e39b9dd1632d189dd2a9591111798b62bc07a516262c9521da722790cc3f10293f2ddd6f502813de43f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qemu-SLOF"
RDEPENDS:${PN} += ""

inherit rpm
