SUMMARY = "Noto Hebrew Droid Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
HebrewDroid Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-hebrewdroid-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "39dbf647f01664ba3855c71dee26655f5a7db4374118d98d46d1987590c00f7b62e7060acd23082404b0ecccc9a47ea66ce0d5ea84925bc298f74732cc72efd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-hebrewdroid noto-sans-hebrewdroid-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
