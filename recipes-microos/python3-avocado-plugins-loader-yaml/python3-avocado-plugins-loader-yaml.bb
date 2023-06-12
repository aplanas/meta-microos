SUMMARY = "Avocado Plugin that loads tests from YAML files"
DESCRIPTION = "This plugin can be used to produce a test suite from definitions in a YAML file, \
similar to the one used in the yaml_to_mux varianter plugin."
LICENSE = "GPL-2.0-only"

PV = "69.0"

RPM_NAME = "python3-avocado-plugins-loader-yaml-69.0-6.10.noarch.rpm"
RPM_HASH = "7985c853e8f482b93b791649957b8b698b2d7e7c437fa5ebf1fd2d714c55a2528b2312fb06dde0bdd3bd54126c22bf4d06da5a3b8ed5acac1217f25edae7527b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-avocado-plugins-loader-yaml \
python3.10dist(avocado-framework-plugin-loader-yaml) \
python3dist(avocado-framework-plugin-loader-yaml)"
RDEPENDS:${PN} += "python(abi) \
python3-avocado-plugins-varianter-yaml-to-mux"

inherit rpm
