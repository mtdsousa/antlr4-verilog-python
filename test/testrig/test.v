module ha(a, b, sum, c);
    input a, b;
    output sum, c;

    assign sum = a ^ b;
    assign c = a & b;
endmodule
