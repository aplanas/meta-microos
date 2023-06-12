SUMMARY = "Front-end component renderer for Dash"
DESCRIPTION = "Front-end component renderer for Dash."
LICENSE = "MIT"

PV = "1.9.1"

RPM_NAME = "python310-dash-renderer-1.9.1-1.10.noarch.rpm"
RPM_HASH = "859897942ebf35631d72744f3c65df7444757a692cdc8e35266091ceece70d7aff50c42ff6c8627f6da32dea59c760ff26115936f0667115b7afb1764e42e85c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dash-renderer \
python3.10dist(dash-renderer) \
python310-dash-renderer \
python3dist(dash-renderer)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
