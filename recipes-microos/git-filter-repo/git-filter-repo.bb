SUMMARY = "Quickly rewrite git repository history (git-filter-branch replacement)"
DESCRIPTION = "git filter-repo is a versatile tool for rewriting history, which includes \
capabilities not found anywhere else. It roughly falls into the same space of \
tool as git filter-branch but without the capitulation-inducing poor \
performance, with far more capabilities, and with a design that scales \
usability-wise beyond trivial rewriting cases."
LICENSE = "GPL-2.0-only | MIT"

PV = "2.38.0"

RPM_NAME = "git-filter-repo-2.38.0-1.2.noarch.rpm"
RPM_HASH = "da33fb86441cfcc16077aba69acb567596fa87abea68447cfc53c07675512ce79ecf327223b175352cde4bc315278fc704231589d33ff5640f005bf7c76f720a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-filter-repo"
RDEPENDS:${PN} += "/usr/bin/python3 \
git-core \
python(abi)"

inherit rpm
