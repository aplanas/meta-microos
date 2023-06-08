SUMMARY = "Base package of KDE PIM PimCommon library"
DESCRIPTION = "This package contains the pimcommon library, used by several KDE PIM \
applications."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "pimcommon-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "65553f8b60be84233ebbe47f2fdaf60a1d1fbbda269f10fd45582f6f53e9c10848aca80994766c2aa97f5961365b8894b9034555bd8ef83ac9de58da560b0462"

RPROVIDES:${PN} += "pimcommon pimcommon(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
