SUMMARY = "Documentation for texlive-endnotesj"
DESCRIPTION = "This package includes the documentation for texlive-endnotesj"
LICENSE = "BSD-3-Clause"

PV = "2023.201.3.0svn47703"

RPM_NAME = "texlive-endnotesj-doc-2023.201.3.0svn47703-53.1.noarch.rpm"
RPM_HASH = "17a27fb24dc530ddf1ea1e19b2bdda87d74b40c4ca02103af883955bbf1c1686d6f09022374bf153a23f439d79d146de6b1de3e36bbfcd1b5a0d782693442de7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-endnotesj-doc:ja) texlive-endnotesj-doc"
RDEPENDS:${PN} += ""

inherit rpm
