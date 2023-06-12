SUMMARY = "Python support for Parquet file format"
DESCRIPTION = "This is a Python implementation of the parquet format \
for integrating it into python-based Big Data workflows."
LICENSE = "Apache-2.0"

PV = "2023.4.0"

RPM_NAME = "python310-fastparquet-2023.4.0-1.1.aarch64.rpm"
RPM_HASH = "d847d08a855431860584e745324f67e8b071f8babca6bb221ba75547076dc3a595cb6381e7b183e30f8ca2b2984839a2d21f1488bf929b9fe7d17284467759eb"

RPROVIDES:${PN} += "python3-fastparquet \
python3.10dist(fastparquet) \
python310-fastparquet \
python310-fastparquet(aarch-64) \
python3dist(fastparquet)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi) \
python310-cramjam \
python310-fsspec \
python310-numpy \
python310-packaging \
python310-pandas"

inherit rpm
