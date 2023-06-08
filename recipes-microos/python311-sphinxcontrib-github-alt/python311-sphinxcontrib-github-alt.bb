SUMMARY = "Sphinx extension to link to GitHub issues, pull requests, commits and users"
DESCRIPTION = "A Sphinx extension to link to GitHub issues, pull requests, commits \
and users for a particular project. \
 \
To use this extension, add it to the extensions list in conf.py, \
and set the variable github_project_url:"
LICENSE = "BSD-2-Clause"

PV = "1.2"

RPM_NAME = "python311-sphinxcontrib-github-alt-1.2-1.12.noarch.rpm"
RPM_HASH = "d7cf051cebb4ccdb6e275077417e08cccb18f9125193ec58d83b11f4256a4737124b76cb7492c24623a8cc66bd75642baae25b7cfb1e14c6627af9f16530eff4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(sphinxcontrib-github-alt) python311-sphinxcontrib-github-alt python3dist(sphinxcontrib-github-alt)"
RDEPENDS:${PN} += "python(abi) python311-Sphinx python311-docutils"

inherit rpm
