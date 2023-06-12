SUMMARY = "Find and read perl modules like perl does"
DESCRIPTION = "This module finds modules in '@INC' using the same algorithm perl does. \
From that, it will give you the source content of a module, the file name \
(where available), and how it was found. Searches (and content) are based \
on the same internal rules that perl uses for _require|perlfunc/require_ \
and _do|perlfunc/do_."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.003003"

RPM_NAME = "perl-Module-Reader-0.003003-1.22.noarch.rpm"
RPM_HASH = "90cb36a82012c3057784758a9ea59b8346d0f5066cfc074e4ab8fc6fc9e8544cc07bce351d2c9b849ef2a54b32280edd7171a6c92555aad02534bf02e22c30ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Module::Reader) \
perl(Module::Reader::File) \
perl-Module-Reader"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
