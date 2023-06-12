SUMMARY = "Python plugin loader"
DESCRIPTION = "straight.plugin is a Python plugin loader inspired by twisted.plugin with two \
important distinctions: \
 \
 - Fewer dependencies \
 - Python 3 compatible \
 \
The system is used to allow multiple Python packages to provide plugins within \
a namespace package, where other packages will locate and utilize. The plugins \
themselves are modules in a namespace package where the namespace identifies \
the plugins in it for some particular purpose or intent."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "python310-straight-plugin-1.5.0-2.12.noarch.rpm"
RPM_HASH = "723ad8e9e6e54323f406f70a1816e5d5ab4872a56597ae44d5a19a1db07b9f6e5a181510c7fe1aa844f5a0ea3627db9ed4fc25ede940ea6361f06b8efcc7cb40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-straight-plugin \
python3.10dist(straight.plugin) \
python310-straight-plugin \
python3dist(straight.plugin)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
