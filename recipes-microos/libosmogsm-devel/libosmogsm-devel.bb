SUMMARY = "Development files for the Osmocom GSM utility library"
DESCRIPTION = "The libosmogsm library in particular is a collection of common code \
used in various GSM related sub-projects inside the Osmocom family of \
projects. It includes A5/1 and A5/2 ciphers, COMP148v1, a LAPDm \
implementation, a GSM TLV parser, SMS utility routines as well as \
protocol definitions for a series of protocols. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmogsm."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-or-later"

PV = "1.7.0"

RPM_NAME = "libosmogsm-devel-1.7.0-2.4.aarch64.rpm"
RPM_HASH = "0772b9e46c5db834a4c5769bb43d390f1c1f2902bc9d7c2a2c8817149324ea2da1c0349a22d1f2dd4952534b54a3d47fba5e67cc9a776e156748e6987eaadf0a"

RPROVIDES:${PN} += "libosmogsm-devel libosmogsm-devel(aarch-64) pkgconfig(libosmogsm)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libosmocore-devel libosmogsm18 pkgconfig(libosmocore) pkgconfig(talloc)"

inherit rpm
