SUMMARY = "Simple interface to Gtk3's complex MVC list widget"
DESCRIPTION = "Gtk3 has a powerful, but complex MVC (Model, View, Controller) system used \
to implement list and tree widgets. Gtk3::SimpleList automates the complex \
setup work and allows you to treat the list model as a more natural list of \
lists structure. \
 \
After creating a new Gtk3::SimpleList object with the desired columns you \
may set the list data with a simple Perl array assignment. Rows may be \
added or deleted with all of the normal array operations. You can treat the \
'data' member of the list simplelist object as an array reference, and \
manipulate the list data with perl's normal array operators. \
 \
A mechanism has also been put into place allowing columns to be Perl \
scalars. The scalar is converted to text through Perl's normal mechanisms \
and then displayed in the list. This same mechanism can be expanded by \
defining arbitrary new column types before calling the new function."
LICENSE = "LGPL-2.1-only"

PV = "0.21"

RPM_NAME = "perl-Gtk3-SimpleList-0.21-2.12.noarch.rpm"
RPM_HASH = "27891a7b5f65a081b1704f7c8593645d703dd8b2ea9ca509be86f399dfd5b79c5111118cb38c776d326166edc7a76e9f5aead63c71c03b4eb85b8f3d6e9675d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Gtk3::SimpleList) perl(Gtk3::SimpleList::TiedList) perl(Gtk3::SimpleList::TiedRow) perl-Gtk3-SimpleList"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Gtk3)"

inherit rpm
