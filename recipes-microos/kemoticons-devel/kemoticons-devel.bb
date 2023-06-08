SUMMARY = "Build environment for kemoticons, an emoticon text converter"
DESCRIPTION = "KEmoticons converts emoticons from text to a graphical representation with \
images in HTML. It supports setting different themes for emoticons coming \
from different providers. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "kemoticons-devel-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "e9f3c6645e06e8fad9dfcfcf95426d215066b24aa95b796220508d0160d5a7a5c7943a1a0959bfea9b1adfec635392572a1f17b418e3783658ebaf037c4ec5df"

RPROVIDES:${PN} += "cmake(KF5Emoticons) kemoticons-devel kemoticons-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5Archive) cmake(KF5Service) cmake(Qt5Gui) extra-cmake-modules libKF5Emoticons5"

inherit rpm
