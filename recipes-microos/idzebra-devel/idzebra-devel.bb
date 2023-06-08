SUMMARY = "Fielded Free Text Engine with a Z39.50 Frontend"
DESCRIPTION = "Zebra is a fielded free text indexing and retrieval engine with a \
Z39.50 front-end. You can use any compatible, commercial, or freeware \
Z39.50 client to access data stored in Zebra."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.6"

RPM_NAME = "idzebra-devel-2.2.6-1.4.aarch64.rpm"
RPM_HASH = "6e99c02ae47048c5a70faba77ed66bf9d8396f371d8b2f0d762393e5375be2660ff68b53f028ec2c4186e13f22bbc6943c27d1782300482f33223e1b16bd71f8"

RPROVIDES:${PN} += "idzebra-devel idzebra-devel(aarch-64) pkgconfig(zebra)"
RDEPENDS:${PN} += "/usr/bin/pkg-config glibc-devel idzebra libyaz-devel pkgconfig(yaz-icu) pkgconfig(yaz-server)"

inherit rpm
