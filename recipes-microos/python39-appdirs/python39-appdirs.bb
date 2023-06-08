SUMMARY = "A small Python module for determining platform-specific dirs"
DESCRIPTION = "``appdirs`` will \
help you choose an appropriate: \
 \
- user data dir (``user_data_dir``) \
- user cache dir (``user_cache_dir``) \
- site data dir (``site_data_dir``) \
- user log dir (``user_log_dir``)"
LICENSE = "MIT"

PV = "1.4.4"

RPM_NAME = "python39-appdirs-1.4.4-4.1.noarch.rpm"
RPM_HASH = "ad65932c6ee9ba748bf41cd6da2e9c01a80da8d7b1ac61d1262957f39f33c3ecf4cc589e836750a75f9c5e2ea3adca165ce4c3426666453089a15b9cd853dd86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(appdirs) python39-appdirs python3dist(appdirs)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
