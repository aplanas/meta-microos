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

RPM_NAME = "python39-releases-1.6.3-5.1.noarch.rpm"
RPM_HASH = "527424066356168d073a12b0e2a77d7a191a24e0f8f01fc97e065921fe2a3d43d702704ec37b46e17a7ceb8cb16a68c5b574b064ecf8696acf8df8976d8bcf3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(releases) python39-releases python3dist(releases)"
RDEPENDS:${PN} += "python(abi) python39-Sphinx python39-semantic_version python39-six"

inherit rpm
