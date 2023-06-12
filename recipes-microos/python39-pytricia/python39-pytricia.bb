SUMMARY = "A library for IP address lookup in Python"
DESCRIPTION = "Pytricia is a python module to store IP prefixes in a patricia tree. \
It's based on Dave Plonka's modified patricia tree code, and has three things \
to recommend it over related modules (including py-radix and SubnetTree)."
LICENSE = "LGPL-3.0-or-later"

PV = "1.0.2"

RPM_NAME = "python39-pytricia-1.0.2-3.12.aarch64.rpm"
RPM_HASH = "7c74c2b7ae08e4d88b71f32fa447b4a97136e8bf6b562afc299f474a322c1795d77996551505f432025dabdec87ac4213aec2a4663a31a7d15d7ad665bc311cf"

RPROVIDES:${PN} += "python3.9dist(pytricia) \
python39-pytricia \
python39-pytricia(aarch-64) \
python3dist(pytricia)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
