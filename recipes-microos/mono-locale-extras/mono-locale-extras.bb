SUMMARY = "Extra locale information"
DESCRIPTION = "The Mono Project is an open development initiative that is working to \
develop an open source, Unix version of the .NET development platform. \
Its objective is to enable Unix developers to build and deploy \
cross-platform .NET applications. The project will implement various \
technologies that have been submitted to the ECMA for standardization. \
 \
Extra locale information."
LICENSE = "LGPL-2.1-only"

PV = "6.12.0"

RPM_NAME = "mono-locale-extras-6.12.0-5.3.aarch64.rpm"
RPM_HASH = "91e588f0418228dc5b3b60f7c1676289d52ca8fffc0e66bbe1b649825ef43d90abf242aecbb221e7cf767c7cfb7ea9c0b943aa734f2a6a1822fd797674c276c0"

RPROVIDES:${PN} += "mono(I18N.CJK) \
mono(I18N.MidEast) \
mono(I18N.Other) \
mono(I18N.Rare) \
mono-locale-extras \
mono-locale-extras(aarch-64)"
RDEPENDS:${PN} += "mono(I18N) \
mono(mscorlib) \
mono-core"

inherit rpm
