SUMMARY = "Python bindings for the Y-CRDT built from yrs (Rust)"
DESCRIPTION = "Python binding for Y-CRDT. It provides distributed data types that enable \
real-time collaboration between devices. Ypy can sync data with any other \
platform that has a Y-CRDT binding, allowing for seamless cross-domain \
communication. The library is a thin wrapper around Yrs, taking advantage of \
the safety and performance of Rust. \
 \
Project is still experimental. Expect the API to change before a version 1.0 \
stable release."
LICENSE = "MIT"

PV = "0.5.5"

RPM_NAME = "python310-y-py-0.5.5-1.3.aarch64.rpm"
RPM_HASH = "c34ab89b436092146305650a4ee2d3ce19548e616746d7746edc8c95eea19c686d66cc7970803c0897320a2c68106bb8ba476f3f0f2660e126d4a06c8a5e218a"

RPROVIDES:${PN} += "python3-y-py \
python3-y_py \
python3.10dist(y-py) \
python310-y-py \
python310-y-py(aarch-64) \
python310-y_py \
python3dist(y-py)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
libm.so.6()(64bit) \
python(abi)"

inherit rpm
