SUMMARY = "Graphical user interface toolkit for Perl"
DESCRIPTION = "This a re-port of a perl interface to Tk8.4. \
C code is derived from Tcl/Tk8.4.5. \
It also includes all the C code parts of Tix8.1.4 from SourceForge. \
The perl code corresponding to Tix's Tcl code is not fully implemented. \
 \
Perl API is essentially the same as Tk800 series Tk800.025 but has not \
been verified as compliant. There ARE differences see pod/804delta.pod."
LICENSE = "(Artistic-1.0 | GPL-1.0-or-later) & Zlib"

PV = "804.036"

RPM_NAME = "perl-Tk-804.036-1.12.aarch64.rpm"
RPM_HASH = "5b117225acb2cc7d2b5df726601b909f5cbdbd91f32c942c2594c2d1eec0de51c24294d55f0497749b5ba62c2d667cf332a2c5202563c43b0f9321039376ee63"

RPROVIDES:${PN} += "perl(Tie::Watch) perl(Tk) perl(Tk::Adjuster) perl(Tk::After) perl(Tk::Animation) perl(Tk::Balloon) perl(Tk::Bitmap) perl(Tk::BrowseEntry) perl(Tk::Button) perl(Tk::Canvas) perl(Tk::Checkbutton) perl(Tk::Clipboard) perl(Tk::CmdLine) perl(Tk::ColorDialog) perl(Tk::ColorEditor) perl(Tk::ColorSelect) perl(Tk::Compound) perl(Tk::Config) perl(Tk::Configure) perl(Tk::Derived) perl(Tk::Dialog) perl(Tk::DialogBox) perl(Tk::DirTree) perl(Tk::DirTreeDialog) perl(Tk::Dirlist) perl(Tk::DragDrop) perl(Tk::DragDrop::Common) perl(Tk::DragDrop::Local) perl(Tk::DragDrop::Rect) perl(Tk::DragDrop::SunConst) perl(Tk::DragDrop::SunDrop) perl(Tk::DragDrop::SunSite) perl(Tk::DragDrop::XDNDDrop) perl(Tk::DragDrop::XDNDSite) perl(Tk::DropSite) perl(Tk::DummyEncode) perl(Tk::DummyEncode::X11ControlChars) perl(Tk::DummyEncode::iso8859_1) perl(Tk::English) perl(Tk::Entry) perl(Tk::ErrorDialog) perl(Tk::Event) perl(Tk::Event::IO) perl(Tk::FBox) perl(Tk::FileSelect) perl(Tk::FloatEntry) perl(Tk::Font) perl(Tk::Frame) perl(Tk::HList) perl(Tk::IO) perl(Tk::IconList) perl(Tk::Image) perl(Tk::InputO) perl(Tk::ItemStyle) perl(Tk::JPEG) perl(Tk::LabEntry) perl(Tk::LabFrame) perl(Tk::LabRadiobutton) perl(Tk::Label) perl(Tk::LabeledEntryLabeledRadiobutton) perl(Tk::Labelframe) perl(Tk::Listbox) perl(Tk::MMtry) perl(Tk::MMutil) perl(Tk::MainWindow) perl(Tk::MakeDepend) perl(Tk::Menu) perl(Tk::Menu::Button) perl(Tk::Menu::Cascade) perl(Tk::Menu::Checkbutton) perl(Tk::Menu::Item) perl(Tk::Menu::Radiobutton) perl(Tk::Menu::Separator) perl(Tk::Menubar) perl(Tk::Menubutton) perl(Tk::Message) perl(Tk::MsgBox) perl(Tk::Mwm) perl(Tk::NBFrame) perl(Tk::NoteBook) perl(Tk::Optionmenu) perl(Tk::PNG) perl(Tk::Pane) perl(Tk::Panedwindow) perl(Tk::Photo) perl(Tk::Pixmap) perl(Tk::Pretty) perl(Tk::ProgressBar) perl(Tk::ROText) perl(Tk::Radiobutton) perl(Tk::Region) perl(Tk::Reindex) perl(Tk::ReindexedROText) perl(Tk::ReindexedText) perl(Tk::Scale) perl(Tk::Scrollbar) perl(Tk::Spinbox) perl(Tk::Stats) perl(Tk::Submethods) perl(Tk::TList) perl(Tk::Table) perl(Tk::Text) perl(Tk::Text::Tag) perl(Tk::TextEdit) perl(Tk::TextList) perl(Tk::TextUndo) perl(Tk::Tiler) perl(Tk::TixGrid) perl(Tk::Toplevel) perl(Tk::Trace) perl(Tk::Tree) perl(Tk::Widget) perl(Tk::WinPhoto) perl(Tk::Wm) perl(Tk::X) perl(Tk::X11Font) perl(Tk::Xlib) perl(Tk::Xrm) perl(Tk::install) perl(Tk::widgets) perl(WidgetDemo) perl-Tk perl-Tk(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/perl ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXft.so.2()(64bit) libc.so.6(GLIBC_2.28)(64bit) libfontconfig.so.1()(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
