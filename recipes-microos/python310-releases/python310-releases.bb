SUMMARY = "A Sphinx extension for changelog manipulation"
DESCRIPTION = "Releases is a Python 2+3 compatible `Sphinx <http://sphinx-doc.org>`_ extension \
designed to help you keep a source control friendly, merge friendly changelog \
file & turn it into useful, human readable HTML output. \
 \
Specifically: \
 \
* The source format (kept in your Sphinx tree as ``changelog.rst``) is a \
  stream-like timeline that plays well with source control & only requires one \
  entry per change (even for changes that exist in multiple release lines). \
* The output (when you have the extension installed and run your Sphinx build \
  command) is a traditional looking changelog page with a section for every \
  release; multi-release issues are copied automatically into each release. \
* By default, feature and support issues are only displayed under feature \
  releases, and bugs are only displayed under bugfix releases. This can be \
  overridden on a per-issue basis."
LICENSE = "BSD-2-Clause"

PV = "1.6.3"

RPM_NAME = "python310-releases-1.6.3-5.1.noarch.rpm"
RPM_HASH = "c0e0209466cb984e9400a5c07e9a6fedf0a0ab052336f3175718cf4e52b71c96caf06611bb85f22a28b0f33192b1acc222b8eba8036cb0295c768879450cd383"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-releases python3.10dist(releases) python310-releases python3dist(releases)"
RDEPENDS:${PN} += "python(abi) python310-Sphinx python310-semantic_version python310-six"

inherit rpm
