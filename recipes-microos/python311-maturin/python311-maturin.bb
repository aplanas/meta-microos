SUMMARY = "Rust/Python Interoperability"
DESCRIPTION = "Build and publish crates with pyo3, rust-cpython and cffi bindings \
as well as rust binaries as python packages. \
 \
This project is a zero-configuration replacement for \
setuptools-rust milksnake. It supports building wheels for Python \
3.6+, can upload them to PyPI and has basic PyPy support."
LICENSE = "Apache-2.0 | MIT"

PV = "0.15.1"

RPM_NAME = "python311-maturin-0.15.1-1.1.aarch64.rpm"
RPM_HASH = "7429a03048fb9414dec0e0c892dcb1cd2c33e6957cba23f42e1a31b28da878165b20eb058ce17098d41c2feec729dc55f09027e2f160722d4a7f92ad77662d30"

RPROVIDES:${PN} += "python3.11dist(maturin) python311-maturin python311-maturin(aarch-64) python3dist(maturin)"
RDEPENDS:${PN} += "/bin/sh libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) python(abi) update-alternatives"

inherit rpm
