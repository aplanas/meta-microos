SUMMARY = "Stats, linear algebra and einops for xarray"
DESCRIPTION = "Stats, linear algebra and einops for xarray"
LICENSE = "Apache-2.0"

PV = "0.5.1"

RPM_NAME = "python311-xarray-einstats-0.5.1-1.1.noarch.rpm"
RPM_HASH = "0d2131c97395196fea164ddafd0a2af59e9da1d58e52c17eccb38d16800339ac7f8c0bdd160990a2c06ed39db109a1cb35a0022069204327e5bbe1f9fd585e65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(xarray-einstats) \
python311-xarray-einstats \
python3dist(xarray-einstats)"
RDEPENDS:${PN} += "python(abi) \
python311-numpy \
python311-scipy \
python311-xarray"

inherit rpm
