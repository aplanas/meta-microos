SUMMARY = "Python Chromium HSTS Preload list"
DESCRIPTION = "Chromium HSTS Preload list as a Python package."
LICENSE = "BSD-3-Clause"

PV = "2023.1.1"

RPM_NAME = "python311-hstspreload-2023.1.1-1.3.noarch.rpm"
RPM_HASH = "ef30f6eeca12e1a4a2d5a7f274bcdf7d729c2cac2a0cfd7feafd6f6bfda7cfb1b788ef2696780b05d50b479f1646610d64287e40718c60dd1cf7f2e244e84cf9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(hstspreload) python311-hstspreload python3dist(hstspreload)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
