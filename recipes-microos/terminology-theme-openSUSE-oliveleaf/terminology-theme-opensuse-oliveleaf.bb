SUMMARY = "Theme for Terminology"
DESCRIPTION = "A old openSUSE theme for Terminology"
LICENSE = "BSD-2-Clause & LGPL-2.1-only & CC-BY-SA-3.0"

PV = "20220219.1.26"

RPM_NAME = "terminology-theme-openSUSE-oliveleaf-20220219.1.26-1.5.noarch.rpm"
RPM_HASH = "dd4e98e447fb3ab2719ef3d60cbe6e8037b2f52dda5cbcbeeaa8c360f11c6d461a77303ad626474eacf6f6e5a47864b41ffe905b53c37fd2580401809e7ceb04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "terminology-theme \
terminology-theme-openSUSE-oliveleaf"
RDEPENDS:${PN} += "terminology"

inherit rpm
