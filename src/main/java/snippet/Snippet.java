package snippet;

public class Snippet {
	created_at datetime NOT NULL DEFAULT CURRENT_TIMESTAMP comment '数据创建时间',
		updated_at datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '数据更新时间',
}

