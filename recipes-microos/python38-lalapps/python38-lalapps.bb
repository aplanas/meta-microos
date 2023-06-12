SUMMARY = "LSC Algorithm Library Applications"
DESCRIPTION = "The LSC Algorithm Library Applications for gravitational wave data analysis. \
This package contains applications that are built on tools in the LSC \
Algorithm Library. \
 \
This package contains the python files"
LICENSE = "GPL-2.0-or-later"

PV = "9.0.0"

RPM_NAME = "python38-lalapps-9.0.0-1.3.aarch64.rpm"
RPM_HASH = "7498c457592bbc84fb52c0d1b01b1e7c82dc2beebe6fa1b6d2aacc7d40e0479aa6ca1ba109acf6ff1cf00c5ec2794248295e6054be9b524f8ccd87206134b185"

RPROVIDES:${PN} += "python38-lalapps \
python38-lalapps(aarch-64)"
RDEPENDS:${PN} += "python(abi) \
python38-h5py \
python38-lal \
python38-lalburst \
python38-lalframe \
python38-lalinference \
python38-lalinspiral \
python38-lalmetaio \
python38-lalpulsar \
python38-lalsimulation \
python38-ligo-lw \
python38-ligo-segments \
python38-matplotlib \
python38-numpy \
python38-scipy"

inherit rpm
