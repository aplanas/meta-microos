SUMMARY = "Neo-grotesque sans-serif typeface family from Google"
DESCRIPTION = "Roboto is Google’s signature family of fonts, the default font on Android and \
Chrome OS, and the recommended font for Google’s visual language, Material Design. \
 \
The font family supports all Latin, Cyrillic, and Greek characters in Unicode 7.0, \
as well as the currency symbol for the Georgian lari, to be published in Unicode 8.0. \
 \
The fonts are currently available in eighteen different styles."
LICENSE = "Apache-2.0"

PV = "2.138"

RPM_NAME = "google-roboto-fonts-2.138-2.5.noarch.rpm"
RPM_HASH = "00a9675af35e61143bc63ecddbce5e898877459a7f5efc804fca3b9c3b34cb1499462399bcafb59f9ff83a7477bcd03bb47c3157bffadedcd9a0d0b7609fde71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-roboto-fonts metainfo() metainfo(google-roboto.metainfo.xml)"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
