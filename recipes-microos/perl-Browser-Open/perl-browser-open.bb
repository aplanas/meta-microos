SUMMARY = "Open a browser in a given URL"
DESCRIPTION = "The functions optionaly exported by this module allows you to open URLs in \
the user browser. \
 \
A set of known commands per OS-name is tested for presence, and the first \
one found is executed. With an optional parameter, all known commands are \
checked. \
 \
The the 'open_browser' manpage uses the 'system()' function to execute the \
command. If you want more control, you can get the command with the the \
'open_browser_cmd' manpage or the 'open_browser_cmd_all' manpage functions \
and then use whatever method you want to execute it."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.04"

RPM_NAME = "perl-Browser-Open-0.04-5.26.noarch.rpm"
RPM_HASH = "2c5c399f45ba500ab1cb99d27ac194dcde71d3dc95c77ca7b43807cc1cb315c92b468cd6467be88f8ce5a095a53bdbaf0ac2a5265064f1f74bb216332e9112ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Browser::Open) \
perl-Browser-Open"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Test::More) \
perl(parent)"

inherit rpm
