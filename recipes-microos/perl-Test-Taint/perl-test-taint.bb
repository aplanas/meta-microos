SUMMARY = "Tools to test taintedness"
DESCRIPTION = "Tainted data is data that comes from an unsafe source, such as the command \
line, or, in the case of web apps, any GET or POST transactions. Read the \
perlsec man page for details on why tainted data is bad, and how to untaint \
the data. \
 \
When you're writing unit tests for code that deals with tainted data, \
you'll want to have a way to provide tainted data for your routines to \
handle, and easy ways to check and report on the taintedness of your data, \
in standard Test::More style."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.08"

RPM_NAME = "perl-Test-Taint-1.08-1.20.aarch64.rpm"
RPM_HASH = "35afa3fa85e7739415494a7baae6810a6c88656ef59b12e0d39dc2fc49f27b22e12dd71b3e483dc71300ca7dffe0809d27ea6a86c5b3e4081d009fe86e6d031f"

RPROVIDES:${PN} += "perl(Test::Taint) \
perl-Test-Taint \
perl-Test-Taint(aarch-64)"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
