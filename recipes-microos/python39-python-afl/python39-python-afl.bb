SUMMARY = "American fuzzy lop fork server and instrumentation for pure-Python code"
DESCRIPTION = "python-afl is an experimental module that enables American fuzzy lop fork server and instrumentation for pure-Python code. \
 \
The scripts to run the fuzzer are only in the package for python3."
LICENSE = "MIT"

PV = "0.7.3"

RPM_NAME = "python39-python-afl-0.7.3-3.11.aarch64.rpm"
RPM_HASH = "ea86f18465368b1b3480d7679c60ff03585c3d54a8d5a9d53082bc89fb15c98e1d1533f0216f9c6db41053b139893d769048c72e5baaa5ca19ec3c8ccfbde08a"

RPROVIDES:${PN} += "python3.9dist(python-afl) \
python39-python-afl \
python39-python-afl(aarch-64) \
python39-python_afl \
python3dist(python-afl)"
RDEPENDS:${PN} += "/bin/sh \
afl \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi) \
update-alternatives"

inherit rpm
