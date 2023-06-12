SUMMARY = "a simple interface to the readline and history libraries"
DESCRIPTION = "This Lua module offers a simple calling interface to the GNU Readline/History Library. \
The function readline() is a wrapper, which invokes the GNU readline, adds the line to the end of the History List, and then returns the line. Usually you call save_history() before the program exits, so that the History List is saved to the histfile. \
Various options can be changed using the set_options{} function. \
The user can configure the GNU Readline (e.g. vi or emacs keystrokes ?) with their individual ~/.inputrc file, see the INITIALIZATION FILE section of man readline. \
By default, the GNU readline library dialogues with the user by reading from stdin and writing to stdout; this fits very badly with applications that want to use stdin and stdout to input and output data. Therefore, this Lua module dialogues with the user on the controlling-terminal of the process (typically /dev/tty) as returned by ctermid(). \
Most of readline's Alternate Interface is now included, namely   handler_install,   read_char   and handler_remove. \
Some applications need to interleave keyboard I/O with file, device, or window system I/O, typically by using a main loop to select() on various file descriptors.   To accommodate this need, readline can also be invoked as a 'callback' function from an event loop, and the Alternate Interface offers functions to do this. \
The Alternate Interface does offer tab-completion; but it does not add to the history file, so you will probably want to call RL.add_history(s) explicitly. See handler_install() \
Access to readline's Custom Completion is now provided. \
This module does not work lua -i because that runs its own readline, and the two conflict with each other."
LICENSE = "MIT"

PV = "3.0"

RPM_NAME = "lua53-readline-3.0-3.2.aarch64.rpm"
RPM_HASH = "7734152fa23a403bbb1fc77ab9f0dfe88f0eee456fcc66a735ee71f1c9814d38b111934c1362ae9d0dc47333418d636dbf1dab577aab724c14ea153af5509864"

RPROVIDES:${PN} += "lua53-readline \
lua53-readline(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
liblua5.3.so.5()(64bit) \
libreadline.so.8()(64bit) \
libreadline.so.8(READLINE_7.0)(64bit) \
lua53-luaposix"

inherit rpm
