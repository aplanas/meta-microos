SUMMARY = "Choose appropriate clone utility"
DESCRIPTION = "'Clone::Choose' checks several different modules which provides a 'clone()' \
function and selects an appropriate one. The default preference is \
 \
  Clone \
  Storable \
  Clone::PP \
 \
This list might evolve in future. Please see EXPORTS how to pick a \
particular one."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.010"

RPM_NAME = "perl-Clone-Choose-0.010-1.17.noarch.rpm"
RPM_HASH = "b2ffd110339932a657e5fdf4c99aa59e9a15cbf7a56becc56d9c44c48134a8ac297c58f1f84cb30261ceae8ccbb3582939fbb76091cfdaedf9c0af8182c6ced2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Clone::Choose) \
perl-Clone-Choose"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
