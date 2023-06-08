SUMMARY = "Sample code for the Python acitoolkit library"
DESCRIPTION = "Python samples for using acitoolkit for programming ACI."
LICENSE = "Apache-2.0"

PV = "0.4"

RPM_NAME = "python-acitoolkit-doc-samples-0.4-5.5.noarch.rpm"
RPM_HASH = "f069f1837305a95d174936fbb8fa8e5e22dbc310b5272b9b4e9da9277f8c0cea842f102ead7dd8efd775159f92ad08017efbbf0014202fe77aaa9e524cb72df1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-acitoolkit-doc-samples"
RDEPENDS:${PN} += "python-acitoolkit-doc python3-PyMySQL"

inherit rpm
