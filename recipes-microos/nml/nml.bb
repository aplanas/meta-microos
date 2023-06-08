SUMMARY = "NewGRF Meta Language"
DESCRIPTION = "A tool to compile nml files to grf or nfo files, making newgrf coding easier."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.2"

RPM_NAME = "nml-0.7.2-1.1.aarch64.rpm"
RPM_HASH = "1d15552e6e8f07a558da12ebf4f5439cf74f72063b4bfa335e41286aaf8f1f8e1980258a41476d41129c94acea5979acabc973ec97cc104fbb6289ce8e8d3fe8"

RPROVIDES:${PN} += "nml nml(aarch-64) nmlc python3.10dist(nml) python3dist(nml)"
RDEPENDS:${PN} += "/usr/bin/python3 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi) python3-Pillow python3-ply python3-setuptools"

inherit rpm
