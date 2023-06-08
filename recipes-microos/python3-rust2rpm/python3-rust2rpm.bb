SUMMARY = "Convert Rust packages to RPM"
DESCRIPTION = "This tool creates RPM spec files for Rust packages. \
The packages can be downloaded from crates.io and this tool \
creates packages that comply with the Fedora Packaging Guidelines, \
Mageia packaging policy, and the openSUSE Packaging Guidelines."
LICENSE = "MIT"

PV = "15"

RPM_NAME = "python3-rust2rpm-15-2.16.noarch.rpm"
RPM_HASH = "f8aeff6f040c7762b0f0b665c19d5adc5227b2691f7e63dd8754f2ed5c2198f146fae7683cee7cf78508924543d268aee89031ced57a4058390bdb43ad1ec5c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rust2rpm python3.10dist(rust2rpm) python3dist(rust2rpm) rust2rpm"
RDEPENDS:${PN} += "/usr/bin/python3 cargo python(abi) python3-Jinja2 python3-requests python3-setuptools python3-tqdm"

inherit rpm
