SUMMARY = "Default settings for KDE Plasma 5"
DESCRIPTION = "This package changes the default settings of Plasma 5."
LICENSE = "CC-BY-SA-4.0 & GPL-2.0-or-later"

PV = "84.87~git20230131T131056~433af24"

RPM_NAME = "plasma5-defaults-openSUSE-84.87~git20230131T131056~433af24-6.1.noarch.rpm"
RPM_HASH = "478fccd3beb1adb0f6f7a64c7edc31e8e92acefb27bfb87b2293af4838dc52522b4233a4b98093df40773c7c823811974ac4125e62ca114b3b8092b6fefd6b40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(plasma5-defaults-openSUSE) plasma5-defaults-openSUSE"
RDEPENDS:${PN} += "distribution-logos-openSUSE-icons plasma5-theme-openSUSE"

inherit rpm
