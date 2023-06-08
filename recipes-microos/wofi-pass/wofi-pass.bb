SUMMARY = "Wofi frontend for pass"
DESCRIPTION = "This script uses wofi and wtype to provide a completely \
Wayland-native way to conveniently use pass (from \
password-storage package). It provides the same search that \
passmenu does, but shows a second dialogue that lets the user \
choose which field to copy/print."
LICENSE = "GPL-2.0-only"

PV = "0.0~git.1646651169.572c0ef"

RPM_NAME = "wofi-pass-0.0~git.1646651169.572c0ef-3.1.noarch.rpm"
RPM_HASH = "b8840f5f1cc1686b76f35b6e7e7483de7a21780c0eea2ce42b06920d6397d1b2f116e6e8092b57f84636c45a8b7f3176f39b6465586a69f4f029dddbd7e209a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wofi-pass"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
