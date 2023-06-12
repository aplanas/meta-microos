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

PV = "2.1.1"

RPM_NAME = "python310-releases-2.1.1-1.1.noarch.rpm"
RPM_HASH = "ff343f3dcfb138985b42bfdc158560b59fdb3153d209edf6aae27536898eb80298f004cc31b34e33484e798b7c51d6835080105a7612807a5b733e0075b1e191"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-releases python3.10dist(releases) python310-releases python3dist(releases)"
RDEPENDS:${PN} += "python(abi) python310-Sphinx python310-semantic_version"

inherit rpm
