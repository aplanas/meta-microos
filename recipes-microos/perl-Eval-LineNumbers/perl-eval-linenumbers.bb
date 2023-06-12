SUMMARY = "Add line numbers to heredoc blocks that contain perl source code"
DESCRIPTION = "Add a '#line 'this-file' 392' comment to heredoc/hereis text that is going \
to be eval'ed so that error messages will point back to the right place. \
 \
Please note: when you embed '\\n' in your code, it gets expanded in \
double-quote hereis documents so it will mess up your line numbering. Use \
'\\\\n' instead when you can."
LICENSE = "Artistic-2.0 | LGPL-2.1-only"

PV = "0.35"

RPM_NAME = "perl-Eval-LineNumbers-0.35-1.9.noarch.rpm"
RPM_HASH = "7368e5b735108f404ba10cb392d7129e01f0e545acbf35249539ec5d224342126368447802501545287772c5e873554bfd44742579e481ee1c2f168db888fa19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Eval::LineNumbers) \
perl-Eval-LineNumbers"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
