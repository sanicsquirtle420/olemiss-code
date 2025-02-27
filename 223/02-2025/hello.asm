.global _start
.intel_syntax noprefix

_start:
	mov rax, 1 // 1 = sys_write
	mov rdi, 1
	lea rsi, [hello_world]
	mov rdx, 27
	syscall

	mov rax, 60 // 60 = sys_exit
	mov rdi, 428
	syscall

hello_world:
	.asciz "Let the kitsune guide you!\n"
