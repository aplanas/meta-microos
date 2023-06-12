SUMMARY = "Neo-grotesque sans-serif typeface family"
DESCRIPTION = "Roboto is Google’s signature family of fonts, the default font on Android and \
Chrome OS, and the recommended font for Google’s visual language, Material Design. \
 \
The font family supports all Latin, Cyrillic, and Greek characters in Unicode 7.0, \
as well as the currency symbol for the Georgian lari, to be published in Unicode 8.0. \
 \
The fonts are currently available in eighteen different styles."
LICENSE = "Apache-2.0"

PV = "0~git20200304"

RPM_NAME = "google-roboto-slab-fonts-0~git20200304-1.9.noarch.rpm"
RPM_HASH = "043b93ec92ba2734b604281cbf6920dd21d543ea4124837b00e26cdc6f861778e717ad5d69e9e2efa3114568610b45757c939a27e48f22c1eb3bd22307496e8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-roboto-fonts:/usr/share/appdata/google-roboto-slab.metainfo.xml \
google-roboto-fonts:/usr/share/fonts/truetype/RobotoSlab-Black.ttf \
google-roboto-fonts:/usr/share/fonts/truetype/RobotoSlab-Bold.ttf \
google-roboto-fonts:/usr/share/fonts/truetype/RobotoSlab-Light.ttf \
google-roboto-fonts:/usr/share/fonts/truetype/RobotoSlab-Medium.ttf \
google-roboto-fonts:/usr/share/fonts/truetype/RobotoSlab-Regular.ttf \
google-roboto-fonts:/usr/share/fonts/truetype/RobotoSlab-Thin.ttf \
google-roboto-slab-fonts \
metainfo() \
metainfo(google-roboto-slab.metainfo.xml)"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
