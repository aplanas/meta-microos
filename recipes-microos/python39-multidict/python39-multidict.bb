SUMMARY = "Multidict implementation"
DESCRIPTION = "Multidicts are useful for working with HTTP headers, URL query \
arguments, etc. \
 \
The code was extracted from the aiohttp library."
LICENSE = "Apache-2.0"

PV = "6.0.4"

RPM_NAME = "python39-multidict-6.0.4-2.1.aarch64.rpm"
RPM_HASH = "8aee45fa52067ec913d1c0b3c2d7f2e1f08365edf522eb299df9b8720067fdcd94d4780048b46e1e48b22893d59c2d41b99520e900cdd89f26d1a5413147fde0"

RPROVIDES:${PN} += "python3.9dist(multidict) \
python39-multidict \
python39-multidict(aarch-64) \
python3dist(multidict)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
