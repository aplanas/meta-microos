SUMMARY = "Documentation for texlive-thesis-ekf"
DESCRIPTION = "This package includes the documentation for texlive-thesis-ekf"
LICENSE = "LPPL-1.0"

PV = "2023.201.4.2svn60228"

RPM_NAME = "texlive-thesis-ekf-doc-2023.201.4.2svn60228-54.1.noarch.rpm"
RPM_HASH = "fa9b7df3ea8988f90a4cdf8bdf9eda458dfcb9f057549394d581ea55e3225e0a7ebfcd93a786038d4e4fa6d4d20e21f927c72d2acaea8e01d221e706069eee47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-thesis-ekf-doc:hu) texlive-thesis-ekf-doc"
RDEPENDS:${PN} += ""

inherit rpm
